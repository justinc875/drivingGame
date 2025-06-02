public class Speed {
    private int topSpeed;
    private double acceleration;
    private double currentSpeed;
    private double breaks;
    private double idleSpeed;

    public Speed (int topSpeed , double acceleration, double breaks, double idleSpeed) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.breaks = breaks;
    }

    public double accelerate (int speed) {
        currentSpeed = speed;
        if (currentSpeed * acceleration > topSpeed) {
            return topSpeed;
        }
        return currentSpeed = currentSpeed * acceleration;
    }

    public double decelerate (int speed) {
        currentSpeed = speed;
        if (currentSpeed * breaks < 1) {
            return 0;
        }
        return currentSpeed * breaks;
    }

    public double idle (int speed) {
        currentSpeed = speed;
        if (currentSpeed * idleSpeed < 1) {
            return 0;
        }
        return currentSpeed * idleSpeed;
    }



}
