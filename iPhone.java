interface ReprodutorMusical {
    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}

interface AparelhoTelefonico {
    void ligar(String numero);

    void atender();

    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}

public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico,
            NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Exemplo");
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.ligar("123456789");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina("http://example.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}

class ReprodutorMusicalImpl implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}

class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}

class NavegadorInternetImpl implements NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}

public class Tocador {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavegadorInternetImpl();

        iPhone meuIphone = new iPhone(reprodutor, telefone, navegador);
        meuIphone.usarReprodutorMusical();
        meuIphone.usarAparelhoTelefonico();
        meuIphone.usarNavegadorInternet();
    }
}
