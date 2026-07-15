package principio_isp;

/*
    I - Princípio da Segregação da Interface
    De acordo com esse princípio, uma classe nunca deve ser
    obrigada a implementar interfaces e métodos que ela não usará.
    De modo geral, esse princípio afirma que é melhor construir
    interfaces pequenas e específicas  em vez de interfaces genéricas.
*/

/*
    Fica evidente como atribuímos comportamentos genéricos para todas as demais classes.
    A Classe Pinguim, por exemplo, acabou sendo forçada a ter o método “setAltitude”,
    situação que não deveria acontecer pois os pinguins não voam.
 */

interface AvesErrada {
    public void setLocalizacao(float longitude, float latitude);
    public void setAltitude(float altitude);
    public void renderizar();
}