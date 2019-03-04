package controls.types;

public enum FanSpeed
{
    ZERO_SPEED(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int fanSpeed;

    FanSpeed(int fanSpeed)
    {
        this.fanSpeed = fanSpeed;
    }

    public int getFanSpeed()
    {
        return fanSpeed;
    }
}
