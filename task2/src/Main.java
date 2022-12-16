// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;


public class Main
{
    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 7, 2, 4, 6 };
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer item : arr)
        {
            linkedList.add(item);
        }
        System.out.println("Дано: " + linkedList);
        enqueue(linkedList, 7);
        System.out.println(linkedList);
        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);
        System.out.println(first(linkedList));
        System.out.println(linkedList);
    }

    public static void enqueue(LinkedList<Integer> list, int num)
    {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list)
    {
        return list.remove(0);
    }

    public static int first(LinkedList<Integer> list)
    {
        return list.get(0);
    }
}