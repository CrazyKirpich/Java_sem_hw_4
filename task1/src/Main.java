// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.


import java.util.LinkedList;


public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {5,3,2,6,7,4,9,1};
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer item : arr)
        {
            linkedList.add(item);
        }
        System.out.println("Изначальный: " + linkedList);
        int index = 0;
        while (index != linkedList.size() - 1)
        {
            linkedList.add(linkedList.size()-index, linkedList.getFirst());
            linkedList.removeFirst();
            index++;
        }
        System.out.println("Перевернутый: " + linkedList);
    }
}
