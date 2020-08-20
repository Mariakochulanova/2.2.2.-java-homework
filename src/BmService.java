public class BmService {

    public float calculate(int bodyweight , float bodyheight) {
        float bmIndex = bodyweight / (bodyheight * bodyheight);

        return bmIndex;

    }
}
