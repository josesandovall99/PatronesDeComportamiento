package PatronState;


/**
 * Estado entregado
 *
 * @author Julio Hurtado, Libardo Pantoja
 */
public class DeliveredState extends OrderState {

    /**
     * @param order to be processed
     */
    public DeliveredState(Order order) {
        super(order);
    }

    /**
     * @return description
     */
    @Override
    public String getStateDescription() {
        return "Entregada";
    }

    /**
     * @return true por orden finalizada
     */
    public boolean isFinished() {
        return true;
    }
}
