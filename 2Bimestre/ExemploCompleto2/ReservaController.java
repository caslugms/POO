public public class ReservaController{
    
        public double calcularPreco(Reserva reserva) {
            double precoBase;
    
            switch (reserva.getTipoQuarto()) {
                case SIMPLES:
                precoBase = 100.0;
                break;
            case DUPLO:
                precoBase = 180.0;
                break;
            case LUXO:
                precoBase = 300.0;
                break;
            default:
                precoBase = 0.0;
        }

        // Exemplo de uso de Wrapper (autoboxing/unboxing com Integer)
        Integer quantidade = reserva.getNumeroHospedes();
        return precoBase * quantidade;
    }
}
 {
    
}
