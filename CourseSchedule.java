import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
        }
        
        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0 && !dfs(graph, visited, i)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean dfs(List<List<Integer>> graph, int[] visited, int course) {
        if (visited[course] == 1) {
            return false;
        }
        
        if (visited[course] == 2) {
            return true;
        }
        
        visited[course] = 1;
        for (int next : graph.get(course)) {
            if (!dfs(graph, visited, next)) {
                return false;
            }
        }
        visited[course] = 2;
        return true;
    }

}
