public class MapDarbas {
    public static void main(String[]args) {
        Map<Integer, String> cats = new LinkedHashMap<>();

        cats.put(2, "Pukis");
        cats.put(1, "Nezinau");
        cats.put(3, "Cigonas");
        cats.put(1, "koldunas");

        for (Integer key : cats.keySet()) {
            System.out.println("Key" + key + "values:" + cats.get(key));
        }
        cats.forEach(k, v) ->System.out.println("Key" + k + "value" + v);
    }

}
