import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ-1");

        Set<Products> foodBasket = new HashSet<>();

        Products bananas = new Products("Бананы", 23.5, 25.3);
        Products tomatoes = new Products("Помидоры", 24.6, 25.3);
        Products orange = new Products("Апельсины", 30.4, 25.3);
        Products pomegranate = new Products("Гранат", 23.5, 25.3);
        Products bread = new Products("Хлеб", 23.5, 25.3);
        Products milk = new Products("Молоко", 23.5, 25.3);
        Products eggs = new Products("Яйца", 23.5, 25.3);
        Products beckon = new Products("Бекон", 23.5, 25.3);
        Products cucumbers = new Products("Огурцы", 23.5, 25.3);

        bananas.addProductsInFoodBasket(foodBasket);
        tomatoes.addProductsInFoodBasket(foodBasket);
        orange.addProductsInFoodBasket(foodBasket);
        pomegranate.addProductsInFoodBasket(foodBasket);
        bread.addProductsInFoodBasket(foodBasket);
        milk.addProductsInFoodBasket(foodBasket);
        eggs.addProductsInFoodBasket(foodBasket);

        foodBasket.remove(eggs);

        System.out.println("\n=======================================");
        System.out.println("ДЗ-2");
        System.out.println("Задание 1");

        Set<Recipe> allRecipe = new HashSet<>();
        Recipe saladFresh = new Recipe("Салат");
        Recipe fruitDish = new Recipe("Фруктовая тарелка");
        Recipe omelet = new Recipe("Омлет");
        Recipe omelet2 = new Recipe("Омлет2");

//        saladFresh.addProductInRecipe(tomatoes, cucumbers);
//        fruitDish.addProductInRecipe(orange, pomegranate);
//        omelet.addProductInRecipe(milk, eggs, beckon);
//        omelet2.addProductInRecipe(milk, eggs, beckon);

        saladFresh.addRecipeInSet(allRecipe);
        fruitDish.addRecipeInSet(allRecipe);
        omelet.addRecipeInSet(allRecipe);
        omelet2.addRecipeInSet(allRecipe);

        System.out.println("\n=======================================");
        System.out.println("ДЗ-2");
        System.out.println("Задание 2");

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < 21; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);
        }

        integerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerSet);

        System.out.println("\n=======================================");
        System.out.println("ДЗ-3");
        System.out.println("Задание 2");

        int [][] mas = new int[15][3];
        for (int i = 0; i < mas.length; i++){
            for (int h = 0; h<mas[i].length; h++){
                mas[i][h] = (int)(Math.random() * 8) + 2;
                if(h == mas[i].length - 1){
                    mas[i][h] = mas[i][h-2] * mas[i][h-1];
                    for(int q = 0; q < i; q++){
                        if(mas[i][h] == mas[q][h]){
                            if(mas[i][h-1] == mas[q][h-1]||mas[i][h-2] == mas[q][h-2]) --i;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < mas.length; i++){
            System.out.print("Задание №" + (i + 1 + " Умножить "));
            for(int h = 0; h < mas[i].length; h++){
                if(h == 0)
                    System.out.print(mas[i][h] + " на ");
                if(h == 1)
                    System.out.println(mas[i][h]);
            }
        }

        System.out.println("\n=======================================");
        System.out.println("ДЗ-3");
        System.out.println("Задание 3");

        Passport passportOne = new Passport(
                3216548632L,
                "Петров ",
                "Петя ",
                "Петрович ",
                "11.03.1980");
        Passport passportTwo = new Passport(
                3216548633L,
                "Иванов ",
                "Иван ",
                "Иванович ",
                "11.03.1980");
        Passport passportThree = new Passport(
                3216548634L,
                "Зайцев ",
                "Заяц ",
                "Зайцевич ",
                "11.03.1980");
        Passport passportFour = new Passport(
                3216548632L,
                "Данилов ",
                "Данил ",
                "Данилович ",
                "11.03.1980");

        HashMap<Long, Passport> passportMap = new HashMap<>();

        passportMap.put(passportOne.getNumPassport(), passportOne);
        passportMap.put(passportTwo.getNumPassport(), passportTwo);
        passportMap.put(passportThree.getNumPassport(), passportThree);
        System.out.println(passportMap);
        passportMap.put(passportFour.getNumPassport(), passportFour);
        System.out.println(passportMap);

        System.out.println(passportMap.get(54616546L));


        System.out.println("\nДомашка коллекции урок №3");
        System.out.println("ДЗ-1");
        System.out.println("Задание 1");

        Phonebook phonebook1 = new Phonebook("+65161256165", "Петров");
        Phonebook phonebook2 = new Phonebook("+6561561665", "Петрова");
        Phonebook phonebook3 = new Phonebook("+651656165", "Иванов");
        Phonebook phonebook4 = new Phonebook("+65161565", "Иванова");
        Phonebook phonebook5 = new Phonebook("+6516156165", "Зайцев");
        Phonebook phonebook6 = new Phonebook("+6516156165", "Зайцева");
        Phonebook phonebook7 = new Phonebook("+65161565", "Волкова");
        Phonebook phonebook8 = new Phonebook("16123456165", "Петров1");
        Phonebook phonebook9 = new Phonebook("6156165", "Петров2");
        Phonebook phonebook10 = new Phonebook("65234216155", "Петров3");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(phonebook1.getName(), phonebook1.getNumber());
        hashMap.put(phonebook2.getName(), phonebook2.getNumber());
        hashMap.put(phonebook3.getName(), phonebook3.getNumber());
        hashMap.put(phonebook4.getName(), phonebook4.getNumber());
        hashMap.put(phonebook5.getName(), phonebook5.getNumber());
        hashMap.put(phonebook6.getName(), phonebook6.getNumber());
        hashMap.put(phonebook7.getName(), phonebook7.getNumber());
        hashMap.put(phonebook8.getName(), phonebook8.getNumber());
        hashMap.put(phonebook9.getName(), phonebook9.getNumber());
        hashMap.put(phonebook10.getName(), phonebook10.getNumber());

        System.out.println(hashMap);

        System.out.println("\n===========================");
        System.out.println("ДЗ-1");
        System.out.println("Задание 2");

        saladFresh.addProductInRecipe(tomatoes, 3);
        saladFresh.addProductInRecipe(cucumbers, 2);
        fruitDish.addProductInRecipe(orange, 3);
        fruitDish.addProductInRecipe(pomegranate, 2);
        omelet.addProductInRecipe(milk, 0);
        omelet.addProductInRecipe(eggs, 3);
        omelet.addProductInRecipe(beckon, 4);

        System.out.println("\n===========================");
        System.out.println("ДЗ-1");
        System.out.println("Задание 3");

        Task3 task3 = new Task3();
        task3.addInTask3("12", 12);
        System.out.println(task3.taskMap);
        task3.addInTask3("12", 13);
        System.out.println(task3.taskMap);

        System.out.println("\n===========================");
        System.out.println("ДЗ-2");
        System.out.println("Задание 1");

        Map<String, List<Integer>> hW3Task1 = new HashMap<>();
        List<Integer> integerList = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList2 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList3 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList4 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        List<Integer> integerList5 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1,
                (int) (Math.random() * 1000) + 1));
        hW3Task1.put("One", integerList);
        hW3Task1.put("Two", integerList2);
        hW3Task1.put("Three", integerList3);
        hW3Task1.put("Four", integerList4);
        hW3Task1.put("Five", integerList5);
        System.out.println(hW3Task1);

        Map<String, Integer> targetHW3Task1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> target : hW3Task1.entrySet()) {
            targetHW3Task1.put(target.getKey(), calcSumOfList(target.getValue()));
        }
        System.out.println(targetHW3Task1);

        System.out.println("\n===========================");
        System.out.println("ДЗ-2");
        System.out.println("Задание 2");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < 10; i++) {
            String s = "String" + i;
            linkedHashMap.put(i, s);
        }
        System.out.println(linkedHashMap);


    }

    public static int calcSumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}