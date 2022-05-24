package desafio.dio;

import desafio.dio.Singleton.SingletonEager;
import desafio.dio.Singleton.SingletonLazy;
import desafio.dio.Singleton.SingletonLazyHolder;
import desafio.dio.Strategy.Comportamento;
import desafio.dio.Strategy.ComportamentoAgressivo;
import desafio.dio.Strategy.ComportamentoDefensivo;
import desafio.dio.Strategy.ComportamentoNormal;
import desafio.dio.Strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

	}

}
