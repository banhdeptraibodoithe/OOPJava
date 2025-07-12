import java.time.Duration;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public StopWatch() {
        this.startTime = LocalTime.now();
    }
    public void start() {
        this.startTime = LocalTime.now();
    }
    public void end() {
        this.endTime = LocalTime.now();
    }
    public long getElapsedTime() {
        Duration time = Duration.between(this.getStartTime(), this.getEndTime());
        return time.toMillis();
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i <= 1000000; i++) {
            System.out.println(i);
        }
        stopWatch.end();
        System.out.println("Thoi gian thuc hien la: " + stopWatch.getElapsedTime() + " Milliseconds");
    }
}
