package hiber.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;

    public Car(String model, int series){
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "model: " + model + ", series: "+series;
    }
}
