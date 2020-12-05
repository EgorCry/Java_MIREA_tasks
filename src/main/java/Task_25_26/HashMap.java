package Task_25_26;

import Task_21_22.Item;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

public class HashMap<K, V> implements HashMapInterface<K, V>{
    private ArrayList<ArrayList<KeyValue<K, V>>> hashMap;
    private int size = 128;

    public HashMap() {
        hashMap = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            hashMap.add(new ArrayList<>());
        }
    }

    @Override
    public void add(K key, V value) {
        int index = Math.abs(key.hashCode() % hashMap.size());
        if(hashMap.get(index).size()==0){
            hashMap.get(index).add(new KeyValue<>(key, value));
        }
        else{
            for (int i = 0; i < hashMap.get(index).size(); i++) {
                if(hashMap.get(index).get(i).getKey().equals(key)){
                    hashMap.get(index).set(i, new KeyValue<>(key, value));
                    break;
                }
            }
        }
    }

    @Override
    public V get(K key) {
        int index = Math.abs(key.hashCode() % hashMap.size());
        for (int i = 0; i < hashMap.get(index).size(); i++) {
            if(hashMap.get(index).get(i).getKey().equals(key)){
                return hashMap.get(index).get(i).getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = Math.abs(key.hashCode() % hashMap.size());
        for (int i = 0; i < hashMap.get(index).size(); i++) {
            if(hashMap.get(index).get(i).getKey().equals(key)){
                Object temp = hashMap.get(index).get(i).getValue();
                hashMap.get(index).remove(hashMap.get(index).get(i));
                return (V) temp;
            }
        }
        return null;
    }

    @Override
    public Iterator<V> iterator() {
        return new CustomIterator();
    }

    public class CustomIterator implements Iterator<V>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < hashMap.get(currentIndex).size();
        }

        @Override
        public V next() {
            return (V) hashMap.get(currentIndex++);
        }
    }
}
