package totallylazypractice.map;

/**
 * Created by ocean on 29/05/14.
 */
public class Glass {
    private int contentPercentage;

    public Glass(int contentPercentage) {
        this.contentPercentage = contentPercentage;
    }

    public int getContentPercentage() {
        return contentPercentage;
    }

    public void setContentPercentage(int contentPercentage) {
        this.contentPercentage = contentPercentage;
    }

    @Override
    public String toString() {
        return contentPercentage + "";
    }
}
