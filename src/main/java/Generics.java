public class Generics <T> {
    private T inputArrays;


    public void set(T inputArrays){
        this.inputArrays = inputArrays;


    }
    public T get(){
        return inputArrays;
    }

    public static void main(String[] args){
        Generics<Integer> intAray = new Generics<Integer>();
        intAray.set(5);


        Generics<String> stringArrays = new Generics<String>();
        stringArrays.set("tebogo");

        System.out.println("An integer array is : "+ intAray.get());
        System.out.println("String array is : " + stringArrays.get());
    }

}
