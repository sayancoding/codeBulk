class Main {
  static void checker(String str) {
    for (int i = 0; i < (str.length() / 2); i++) {
      long first = Long.parseLong(str.substring(0, i + 1));
      String output = "";
      int inc = 0;
      while (output.length() < str.length()) {
        long num = first + (inc++);
        String temp = String.valueOf(num);
        output = output + temp;
      }
      if (str.equals(output)) {
        System.out.println(output);
        return;
      }
    }
    System.out.println("Not beautiful string");
  }

  public static void main(String[] args) {
    String str = "66666666666666666666666666666666";
    checker(str);
  }
}