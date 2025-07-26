public class bytearray {
    public static void main(String[] args) {
        String str="Java";
        byte[] bytes=str.getBytes();
        for(byte b: bytes){
            System.out.println(b+" ");
        }
        System.out.println();
    }
}
