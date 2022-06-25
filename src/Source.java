public class Source {
    public static void main(String[] args) {
        String inp = "1";
        System.out.println(binToDecimal(inp)==1);
    }
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp,2);
    }
}
