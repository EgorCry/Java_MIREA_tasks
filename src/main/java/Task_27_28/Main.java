package Task_27_28;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, InvocationTargetException, IllegalAccessException {
        Gson gson = new Gson();
        Employee employee = new Employee();
        Type ReflectionTaskType = new TypeToken<ArrayList<ReflectionOfTask>>(){
        }.getType();
        Class<? extends Employee> worker = employee.getClass();

        List<Method> methodList = Arrays.stream(worker.getDeclaredMethods())
                .filter(a -> Arrays.stream(a.getAnnotations()).anyMatch(b -> b instanceof Backbone))
                .collect(Collectors.toList());

        ArrayList<ReflectionOfTask> tasks = gson.fromJson(Employee.getTasks(), ReflectionTaskType);
        for(ReflectionOfTask reflection: tasks){
            for(Method declareMethod: methodList){
                if(reflection.getType().equals(declareMethod.getName())){
                    declareMethod.invoke(employee, reflection.getData());
                }
            }
        }
    }
}
