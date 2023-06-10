import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        Map<String,Integer> words = new HashMap<>();
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Integer index;
        for (String s : strings) {
            index = words.get(s);
            if(index==null){
                index = 0;
            }
            words.put(s,++index);
        }
        System.out.println(words);
    }

    private static void task3() {
     String text = "Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли." +
             " Код должен работать с любой последовательностью и объемом списка слов." +
             " В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения." +
             " - Критерии проверки" +
             " - В консоль выводятся только уникальные слова из списка слов" +
             " - Код работает с любой последовательностью и объемом списка слов";
     text = text.toLowerCase();
     text = text.replace(".","");
     text = text.replace(",","");
     Map<String,Integer> words = new HashMap<>();
     ArrayList<String> notFiltered = new ArrayList<>(List.of(text.split(" ")));
        Integer index;
        for (String s : notFiltered) {
            index = words.get(s);
            if(index==null){
                index = 0;
            }
            words.put(s,++index);
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1){
                System.out.print(key +" ");
            }
        }
        System.out.println();
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<Integer>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> hashNums = new HashSet<>();
        hashNums.addAll(nums);
        nums = new ArrayList<>(hashNums);
        Collections.sort(nums);
        for (Integer num : nums) {
            if (num%2==0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num%2!=0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }


}