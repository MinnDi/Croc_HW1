public class bytes {
    public static void main(String args[]) {
        printBytes(12055);
        printBytes(834127437);
        printBytes(23);
        printBytes(999999999);
        printBytes(999923839999988L);
        printBytes(9223372036854775807L);
        printBytes(2147483647);

    }

    public static void printBytes(long bytes) {
        String str;
        String form;
        form = "B";
        byte t = 0;
        double by;
        by = (double) bytes;
        while (by> 1024){
            by = by/1024;
            t++;
        }
        if (t == 1) {
            form = "KB";
        } else if (t == 2) {
            form = "MB";
        } else if (t == 3) {
            form = "GB";
        } else if (t == 4) {
            form = "TB";
        } else if (t == 5) {
            form = "PB";
        } else if (t == 6) {
            form = "EB";
        }
        str = String.format("%.1f", by);
        str = str + " " + form;
        System.out.println(str);
    }
}