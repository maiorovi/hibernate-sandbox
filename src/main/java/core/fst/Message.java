package core.fst;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String message;
//    private Account accout;
    @Type(type = "core.snd.LocalDateUserType")
    private LocalDate dateExperiment;

    @Type(type="core.snd.LocalDateTimeUserType")
    private LocalDateTime localDateTime;

    @Type(type="core.snd.LocalTimeUserType")
    private LocalTime localTime1;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDateExperiment() {
        return dateExperiment;
    }

    public void setDateExperiment(LocalDate dateExperiment) {
        this.dateExperiment = dateExperiment;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Message{");
        sb.append("id=").append(id);
        sb.append(", message='").append(message).append('\'');
        sb.append(", dateExperiment=").append(dateExperiment);
        sb.append(", localDateTime=").append(localDateTime);
        sb.append(", localTime=").append(localTime1);
        sb.append('}');
        return sb.toString();
    }

    public LocalTime getLocalTime() {
        return localTime1;
    }

    public void setLocalTime(LocalTime localTime1) {
        this.localTime1 = localTime1;
    }
}
