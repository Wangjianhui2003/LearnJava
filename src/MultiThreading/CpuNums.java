package MultiThreading;

//查看可用的cpu核心
public class CpuNums {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums + " cpus available");
    }
}
