package com.tvd12.ezyfox.core.model;

/**
 * Each user must have a unique user name
 * 
 * @author tavandung12
 *
 */
public abstract class ApiBaseUser extends ApiModel {

    /**
     * Get unique user id
     * 
     * @return user id
     */
    public abstract int getId();
    
    /**
     * Get unique user name
     * 
     * @return user name
     */
    public abstract String getName();
    
    /**
     * Get client ip address
     * 
     * @return ip address
     */
    public abstract String getIp();
    
    /**
     * Get user's buddy properties 
     * 
     * @return user's buddy properties
     */
    public abstract <T extends ApiBuddyProperties> T getBuddyProperties();
    
}
