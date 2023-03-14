package Chapter9_ObjectsAndClasses.exercise;

public class StopWatch {
    private long startTime; // Start time
    private long endTime;	// End time

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }


    public long getElapsedTime() {
        return getEndTime() - getStratTime();
    }

    public long getStratTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;

    }
}
