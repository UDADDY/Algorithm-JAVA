class Solution {
    int[] candidates;
    int N;
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        this.N = candidates.length;
        Arrays.sort(candidates);
        res = new ArrayList<>();

        dfs(target, 0, new ArrayList<>());

        return res;
    }

    private void dfs(int target, int start, List<Integer> comb) {
        // System.out.println(comb);
        if(target == 0) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if(target < 0) {
            return;
        }

        if(N <= start)
            return;

        for(int i=start; i<N; i++) {
            if(start < i && candidates[i] == candidates[i - 1])
                continue;

            if(target < candidates[i])
                break;

            comb.add(candidates[i]);
            dfs(target - candidates[i], i + 1, comb);
            comb.remove(comb.size() - 1);
        }
    }
}