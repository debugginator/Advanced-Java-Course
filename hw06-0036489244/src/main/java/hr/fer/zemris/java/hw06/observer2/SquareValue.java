package hr.fer.zemris.java.hw06.observer2;

/**
 * Implementation of {@link IntegerStorageObserver} which write a square of the
 * value stored in the {@link IntegerStorage} to the standard output.
 * 
 * @author Blaz Bagic
 * @version 1.0
 */
public class SquareValue implements IntegerStorageObserver {

  @Override
  public void valueChanged(IntegerStorageChange istorageChange) {
    int value = istorageChange.getIntegerStorage().getValue();
    System.out.printf("Provided new value: %d, square is %d\n", value, value * value);
  }

}
