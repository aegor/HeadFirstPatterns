package controls.types;

public enum RoomType
{
    LIVING_ROOM("living room"),
    KITCHEN("kitchen"),
    GARAGE("garage");

    private String description;

    RoomType(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
