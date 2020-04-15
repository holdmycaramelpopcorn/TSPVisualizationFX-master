
package solvers.model;

import javafx.geometry.Point2D;

import java.util.Objects;


public class City implements Comparable<City> {

    private final Point2D location;

    public City(double x, double y) {
        this.location = new Point2D(x, y);
    }

    @Override
    public int compareTo(City o) {
        return (int) this.getLocation().distance(o.getLocation());
    }

    public double distanceTo(City o) {
        return this.getLocation().distance(o.getLocation());
    }

    public Point2D getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "("+(int)location.getX()+","+(int)location.getY()+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(getLocation(), city.getLocation());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getLocation());
    }
}
