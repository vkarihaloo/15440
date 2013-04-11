
/**
 * 
 * @author nickzukoski
 *
 * A generic interface for all tasks (map, reduce) to conform to.
 */
public interface Task {
	
	public int getTaskId();
	public void setTaskId(int taskId);
	public int getJobId();
	public void setJobId(int jobId);
	public MapReduceJob getJob();
	public void setJob(MapReduceJob job);
}
