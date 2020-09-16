package RestaurantReservation;

public class ReservationApproved extends AbstractEvent {

    private Long id;
    private Long ownerID;
    private String status;
    private String reservationDate;
    private Long reservationID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOwnerId() {
        return ownerID;
    }

    public void setOwnerId(Long ownerID) {
        this.ownerID = ownerID;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }
    public Long getReservationId() {
        return reservationID;
    }

    public void setReservationId(Long reservationID) {
        this.reservationID = reservationID;
    }
}