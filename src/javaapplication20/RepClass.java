package javaapplication20;


public class RepClass {
    private String pharname = null;
    private String date = null;
    private String reply = null;
    
    public RepClass(String pharName, String date, String reply){
    this.date = date;
    this.pharname = pharName;
    this.reply = reply;
    
}

    public String getPharName() {
        return pharname;
    }

    public String getDate() {
        return date;
    }

    public String getReply() {
        return reply;
    }
    
    
}
