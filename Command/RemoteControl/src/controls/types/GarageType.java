package controls.types;

public enum GarageType
{
    MAIN("main garage"),
    GUEST("guest garage");

    private String description;

    GarageType(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
