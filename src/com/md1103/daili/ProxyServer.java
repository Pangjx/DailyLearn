package com.md1103.daili;

public class ProxyServer {
   private NetWork work;

public ProxyServer(NetWork work) {
	super();
	this.work = work;
}

public void check() {
	  System.out.println("����֮ǰ�ļ�鹤��");
  }

  public void browse() {
	  check();
	  work.browce();
  }
}
