import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        while (input != null) {
            bw.write(input);
            bw.newLine();
            input = br.readLine();
        }
        
        bw.flush();
        bw.close();
    }
}