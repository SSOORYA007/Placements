public class string1 {
    public static void main(String[] args) {
        String name = "Hello Everyone Welcome";

        String lower = name.toLowerCase();
        String upper = name.toUpperCase();
        int count = name.length();

        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        System.out.println(name.charAt(0));
        System.out.println(name.substring(0, 3));
        System.out.println(name.equals("Hello Everyone Welcome"));
        System.out.println(name.equalsIgnoreCase("h"));
        System.out.println(name.contains("yo"));
        System.out.println(name.replace("H", "B"));
        System.out.println(name.indexOf("e"));
        System.out.println(name.lastIndexOf("e"));

        // StringBuilder Methods
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println("append: " + sb);

        sb.insert(5, " Java");
        System.out.println("insert: " + sb);

        sb.replace(6, 10, "Everyone");
        System.out.println("replace: " + sb);

        sb.delete(5, 14);
        System.out.println("delete: " + sb);

        sb.reverse();
        System.out.println("reverse: " + sb);

        sb.reverse();

        sb.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb);

        sb.setCharAt(0, 'M');
        System.out.println("setCharAt: " + sb);

    }
}
