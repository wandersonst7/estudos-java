package principio_isp;

/*
    I - Princípio da Segregação da Interface
    De acordo com esse princípio, uma classe nunca deve ser
    obrigada a implementar interfaces e métodos que ela não usará.
    De modo geral, esse princípio afirma que é melhor construir
    interfaces pequenas e específicas  em vez de interfaces genéricas.
*/

class PinguimErrado implements AvesErrada {
    public void setLocalizacao(float longitude, float latitude) {
        // faz alguma coisa
    }

    public void setAltitude(float altitude) {
        // não irá fazer nada, pois pinguins não voam
    }

    public void renderizar() {
        // faz alguma coisa
    }
}
