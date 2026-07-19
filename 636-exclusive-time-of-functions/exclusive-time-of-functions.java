class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] times = new int[n];

        Deque<int[]> s = new ArrayDeque<>();
        for(String log : logs) {
            String[] split = log.split(":");

            int id = Integer.parseInt(split[0]);
            String command = split[1];
            int time = Integer.parseInt(split[2]);

            if(s.isEmpty())
                s.addLast(new int[] {id, time});
            else {
                int[] top = s.peekLast();

                if(command.equals("start")) {
                    times[top[0]] += time - top[1];
                    s.addLast(new int[] {id, time});
                } else {
                    time++;
                    times[top[0]] += time - top[1];
                    s.removeLast();

                    if(!s.isEmpty()) {
                        s.peekLast()[1] = time;
                    }
                }
            }

        }

        return times;
    }
}