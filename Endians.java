import java.io.*;
import java.util.*;

public class Endians {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
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

    static int n, k;
    static long[] w;
    static ArrayList<Integer>[] g;

    static long answer;

    static class State {
        long[][] dp;
        int[] sz;

        State(int n, int k) {
            dp = new long[n + 1][k + 1];
            sz = new int[n + 1];
        }
    }

    static State solveForRoot(int root) {

        State st = new State(n, k);

        dfs(root, 0, root, st);

        return st;
    }

    static void dfs(int u, int p, int root, State st) {

        st.sz[u] = 1;

        // dp[u][s] = maximum extra score in subtree u
        // if exactly s nodes are selected from subtree u
        // and u is selected

        st.dp[u][1] = w[u];

        for (int v : g[u]) {

            if (v == p)
                continue;

            dfs(v, u, root, st);

            long[] ndp = new long[k + 1];

            Arrays.fill(ndp, -1);

            for (int a = 1; a <= Math.min(k, st.sz[u]); a++) {

                if (st.dp[u][a] < 0)
                    continue;

                ndp[a] = Math.max(ndp[a], st.dp[u][a]);

                for (int b = 1; b <= Math.min(k - a, st.sz[v]); b++) {

                    if (st.dp[v][b] < 0)
                        continue;

                    long val =
                            st.dp[u][a]
                                    + st.dp[v][b]
                                    + w[u] * b;

                    ndp[a + b] = Math.max(ndp[a + b], val);
                }
            }

            st.sz[u] += st.sz[v];

            for (int i = 1; i <= Math.min(k, st.sz[u]); i++) {
                st.dp[u][i] = ndp[i];
            }
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int t = fs.nextInt();

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {

            n = fs.nextInt();
            k = fs.nextInt();

            w = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                w[i] = fs.nextLong();
            }

            g = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                g[i] = new ArrayList<>();
            }

            for (int i = 0; i < n - 1; i++) {

                int u = fs.nextInt();
                int v = fs.nextInt();

                g[u].add(v);
                g[v].add(u);
            }

            for (int root = 1; root <= n; root++) {

                State st = solveForRoot(root);

                long ans = st.dp[root][k];

                out.append(ans).append(" ");
            }

            out.append("\n");
        }

        System.out.print(out);
    }
}