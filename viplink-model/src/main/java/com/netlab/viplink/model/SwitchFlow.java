//  (c) Copyright 2013 Hewlett-Packard Development Company, L.P.
//  Autogenerated
package com.netlab.viplink.model;

import java.util.UUID;

import com.hp.api.Id;
import com.hp.of.lib.dt.DataPathId;
import com.hp.sdn.Model;
import com.hp.util.ip.BigPortNumber;
import com.hp.util.ip.IpAddress;
import com.hp.util.ip.IpProtocol;
import com.hp.util.ip.MacAddress;
import com.hp.util.ip.PortNumber;
import com.hp.util.ip.TcpUdpPort;
import com.hp.util.ip.VlanId;

/**
 * Sample SwitchFlow domain model.
 */
public class SwitchFlow extends Model<SwitchFlow> {


    // Just to make the sample a bit more interesting.
    private String name;
    private DataPathId dpid;
    private IpAddress srcip;
    private IpAddress srcipmask;
    private IpAddress dstip;
    private IpAddress dstipmask;
    private IpProtocol protl;
    private PortNumber srcport;
    private PortNumber dstport;
    private VlanId invlan;
    private VlanId outvlan;
    private BigPortNumber outport; // physical output interface
    private BigPortNumber inport;  // physical input interface
    private MacAddress insrcmac;
    private MacAddress indstmac;
    private MacAddress outsrcmac;
    private MacAddress outdstmac;
    private int pushvlan;

    /** 
     * Default constructor required for serialization.
     */
    public SwitchFlow() {
        super();
    }

    public SwitchFlow(String name){
    	super();
    	this.name = name;
    }
    
    
    
    
    /**
     * Creates a new SwitchFlow entity with input physical interface and source transport number unset.
     * @param name
     * @param dpid
     * @param srcip
     * @param dstip
     * @param protl
     * @param dstport
     * @param outport
     */
    public SwitchFlow(String name, DataPathId dpid, IpAddress srcip, IpAddress srcipmask, 
    		IpAddress dstip, IpAddress dstipmask, 
			  IpProtocol protl, PortNumber dstport, MacAddress insrcmac, MacAddress indstmac,
			  MacAddress outsrcmac, MacAddress outdstmac, VlanId invlan, VlanId outvlan, 
			  BigPortNumber inport, BigPortNumber outport, int pushvlan) {
    	this(name, dpid, srcip, srcipmask, dstip, dstipmask, protl, PortNumber.valueOf(0), dstport, 
    			insrcmac, indstmac, outsrcmac, outdstmac, invlan, outvlan, inport, outport, pushvlan);
    }

    
    /** 
     * Creates a new generic SwitchFlow entity. 
     *
     */
    public SwitchFlow(String name, DataPathId dpid, IpAddress srcip, IpAddress srcipmask, 
    		IpAddress dstip, IpAddress dstipmask, 
			  IpProtocol protl, PortNumber srcport, PortNumber dstport, MacAddress insrcmac, 
			  MacAddress indstmac, MacAddress outsrcmac, MacAddress outdstmac, VlanId invlan, 
			  VlanId outvlan, BigPortNumber inport, BigPortNumber outport, int pushvlan) {
      super();
      this.name = name;
      this.dpid = dpid;
      this.srcip = srcip;
      this.srcipmask = srcipmask;
      this.dstip = dstip;
      this.dstipmask = dstipmask;
      this.protl = protl;
      this.dstport = dstport; 
      this.srcport = srcport; 
      
      this.insrcmac = insrcmac;
      this.indstmac = indstmac;
      this.outsrcmac = outsrcmac;
      this.outdstmac = outdstmac;
      
      this.outport = outport;
      this.inport = inport;  
     
      this.outvlan = outvlan;
      this.invlan = invlan;
      
      this.pushvlan = pushvlan;
  }
    
    
  /**
   * Getters
   */
    
    public String name() {
        return name;
    }
    
    public DataPathId dpid() {
    	return dpid;
    }
    
    public IpAddress srcip(){
    	return srcip;
    }
    
    public IpAddress srcipmask(){
    	return srcipmask;
    }
    
    public IpAddress dstip(){
    	return dstip;
    }
    
    public IpAddress dstipmask(){
    	return dstipmask;
    }
    
    public IpProtocol protl(){
    	return protl;
    }
    
    public PortNumber srcport(){
    	return srcport;
    }
    
    public PortNumber dstport(){
    	return dstport;
    }
    
    public BigPortNumber inport(){
    	return inport;
    }
    
    public BigPortNumber outport(){
    	return outport;
    }
    
    public VlanId outvlan(){
    	return outvlan;
    }
    
    public VlanId invlan(){
    	return invlan;
    }
    
    public int pushvlan(){
    	return pushvlan;
    }
    	
    public MacAddress insrcmac(){
    	return insrcmac;
    }
    
    public MacAddress indstmac(){
    	return indstmac;
    }
    
    public MacAddress outsrcmac(){
    	return outsrcmac;
    }
    
    public MacAddress outdstmac(){
    	return outdstmac;
    }
    
    

    /**
     * Setters
     */
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDpid(DataPathId dpid){
    	this.dpid = dpid;
    }
    
    public void setSrcip(IpAddress srcip){
    	this.srcip = srcip;
    }
    
    public void setSrcipmask(IpAddress srcipmask){
    	this.srcipmask = srcipmask;
    }
    
    public void setDstip(IpAddress dstip){
    	this.dstip = dstip;
    }
    
    public void setDstipmask(IpAddress dstipmask){
    	this.dstipmask = dstipmask;
    }
    
    public void setProtl(IpProtocol protl){
    	this.protl = protl;
    }
    
    public void setSrcport(PortNumber srcport){
    	this.srcport = srcport;
    }
    
    public void setDstport(PortNumber dstport){
    	this.dstport = dstport;
    }
    
    public void setInport(BigPortNumber inport){
    	this.inport = inport;
    }
    
    public void setOutport(BigPortNumber outport){
    	this.outport = outport;
    }
    
    public void setOutvlan(VlanId outvlan){
    	this.outvlan = outvlan;
    }
    
    public void setInvlan(VlanId invlan){
    	this.invlan = invlan;
    }
    
    public void setPushvlan(int pushvlan){
    	this.pushvlan = pushvlan;
    }
    
    public void setInsrcmac(MacAddress insrcmac){
    	this.insrcmac = insrcmac;
    }
    
    public void setIndstmac(MacAddress indstmac){
    	this.indstmac = indstmac;
    }
    
    public void setOutsrcmac(MacAddress outsrcmac){
    	this.outsrcmac = outsrcmac;
    }
    
    public void setOutdstmac(MacAddress outdstmac){
    	this.outdstmac = outdstmac;
    }
    
    @Override
    /**
     * Equality test is based on <dpid, srcip, dstip, protocol, dstport>
     */
    public boolean equals(Object o){
    	if (!(o instanceof SwitchFlow))
    		return false;
    	SwitchFlow sf = (SwitchFlow)o;
    	return sf == this || (sf.dpid().equals(dpid) && sf.srcip().equals(srcip) && 
    			sf.srcipmask().equals(srcipmask) && sf.dstip().equals(dstip) && 
    			sf.dstipmask().equals(dstipmask) &&
    			sf.protl().equals(protl) && sf.dstport().equals(dstport));
    }
    
    
    @Override
    public int hashCode(){
    	int hash = 7;
    	hash = name.hashCode() + hash * 11 ;
    	hash = dpid.hashCode() * 3 + hash * 13;
    	hash = srcip.hashCode() + hash;
    	hash = srcipmask.hashCode() * 17 + hash;
    	hash = dstip.hashCode() + hash * 11;
    	hash = dstipmask.hashCode() * 7 + hash;
    	hash = protl.hashCode() * 19 + hash;
    	hash = srcport.hashCode() + hash * 31;
    	hash = dstport.hashCode() + hash;
    
    	return (hash >= 0)? hash: -hash;
    }
    
}
