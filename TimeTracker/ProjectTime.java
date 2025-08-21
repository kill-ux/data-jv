import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
    }

    public void setStartTime(String start) {
        this.startTime = start;
    }

    public void setEndTime(String end) {
        this.endTime = end;
    }

    public String getStartTime() {
        return this.startTime;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public String getHoursLogged() {
        try {
            long start = formatter.parse(this.startTime).getTime();
            long end = formatter.parse(this.endTime).getTime();
            long minuse = end - start ;
            if (minuse<0) {
                return "-1";
            }
            System.out.println(minuse / 30 / 24 / 60 / 60 / 1000);
            if (minuse / 1000 / 60 < 120) {
                return String.format("%d m",minuse / 60 / 1000);
            } else if (minuse /  60 / 60 / 1000 < 120) {
                return String.format("%d h",minuse / (60 * 60 * 1000));
            } else if (minuse / 1000 / 60 / 60 / 24 < 120) {
                return String.format("%d d",minuse / 24 / 60 / 60 / 1000);
            } else {
                return String.format("%d mo",minuse / 30 / 24 / 60 / 60 / 1000);
            }
        } catch (ParseException e) {
            return "-1";
        }
    }
}