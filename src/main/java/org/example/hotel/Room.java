package org.example.hotel;

/*
 * 酒店的房间
 * @author
 * @version 1.0
 * @since 1.0
 * */
public class Room {
    /*
     * 房间编号：
     * 101-110
     * 201-220
     *...
     * */
    private int roomNo;
    /*
     * 房间的类型：单人间，标准间，豪华间
     * */
    private String type;
    /*
     * true表示占用，false表示空闲
     * */
    private boolean state;

    public Room() {
    }

    public Room(int roomNo, String type, boolean state) {
        this.roomNo = roomNo;
        this.type = type;
        this.state = state;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "[" + this.roomNo + ',' + this.type + ',' + (this.state ? "占用" : "空闲") + ']';
    }
}
