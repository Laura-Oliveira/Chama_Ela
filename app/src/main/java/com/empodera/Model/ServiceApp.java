package com.empodera.Model;

import android.widget.EditText;

public class ServiceApp
{
    private String id;
    private String serviceName;
    private float priceService, priceTicket;
    //private String typeService;

    public ServiceApp()
    {
        this.id = id;
        this.serviceName = serviceName;
        this.priceService = priceService;
        this.priceTicket = priceTicket;
        //this.typeService = typeService;

    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getServiceName()
    {
        return serviceName;
    }

    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }

    public float getPriceService()
    {
        return priceService;
    }

    public void setPriceService(float priceService)
    {
        this.priceService = priceService;
    }

    public float getPriceTicket()
    {
        return priceTicket;
    }

    public void setPriceTicket(float priceTicket)
    {
        this.priceTicket = priceTicket;
    }

   /* public String getTypeService()
    {
        return typeService;
    }

    public void setTypeService(String typeService)
    {
        this.typeService = typeService;
    }
*/
}
