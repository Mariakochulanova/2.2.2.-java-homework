public class BmService {

    public float calculate(int bodyWeight , float bodyHeight) {
        float bmIndex = bodyWeight / (bodyHeight * bodyHeight);

        return bmIndex;

    }
}
