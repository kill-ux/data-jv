import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    private long date;
    private String formattedDate;
    private String format;

    public DateFormatter() {
        this.format = "DD/MM/YYYY";
        this.long = System.currentTimeMillis() / 1000;
    }

    public DateFormatter(long date) {
        this.date = date;
    }

    public DateFormatter(long date, String format) {
        this.date = date;
        this.format = format;
    }


    public long getDate() {
        return this.date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getFormattedDate() {
        switch(this.format) {
            case -> {
                return new SimpleDateFormat("")
            }
        }
        return this.formattedDate;
    }

    // public void setFormattedDate(String formattedDate) {
    //     this.formattedDate = formattedDate;
    // }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}