import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
            int n = fs.nextInt();
            String s = fs.next();
 
            int balance = 0;
            int ans = 0;
 
            for (char c : s.toCharArray()) {
                if (c == '(')
                balance++;
                else
                balance--;
 
                if (balance < 0) {
                    ans++;
                    balance = 0;
                }
        }
 
    out.println(ans);
}
 
out.flush();
}
 
static class FastScanner {
    private final BufferedReader br;
    private StringTokenizer st;
 
    FastScanner(InputStream in) {
        br = new BufferedReader(new InputStreamReader(in));
    }
 
String next() throws IOException {
    while (st == null || !st.hasMoreTokens()) {
        String line = br.readLine();
        if (line == null) return null;
        st = new StringTokenizer(line);
    }
return st.nextToken();
}
 
int nextInt() throws IOException {
    return Integer.parseInt(next());
}
 
long nextLong() throws IOException {
    return Long.parseLong(next());
}
}
}