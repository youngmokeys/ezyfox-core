/**
 * 
 */
package com.tvd12.ezyfox.core.command;

import com.tvd12.ezyfox.core.model.ApiBaseUser;
import com.tvd12.ezyfox.core.model.ApiZone;

/**
 * Execute this command to adds a new buddy to the BuddyList of the specified User.
 * 
 * @author tavandung12
 *
 */
public interface AddBuddy extends BaseCommand {

    /**
     * buddy's owner
     * 
     * @param owner owner
     * @return this pointer
     */
    public <T extends AddBuddy> T owner(ApiBaseUser owner);
    
    /**
     * name of buddy's owner
     * 
     * @param ownerName owner name
     * @return this pointer
     */
    public <T extends AddBuddy> T owner(String ownerName);
    
    /**
     * If you set zone this command will add a buddy to the User's buddy list 
     * even if the User is not online at the moment This feature is not implemented yet.
     * 
     * @param zone which zone user's now in
     * @return this pointer
     */
    public <T extends AddBuddy> T zone(ApiZone zone);
    
    /**
     * name of buddy to add
     * 
     * @param buddyName buddy name
     * @return this pointer
     */
    public <T extends AddBuddy> T buddy(String buddyName);
    
    /**
     * if true, the Buddy is only temporary and will be lost when the user logs out
     * 
     * @param isTemp is temporary?
     * @return this pointer
     */
    public <T extends AddBuddy> T temp(boolean isTemp);
    
    /**
     * if true, send a client update
     * 
     * @param fireClientEvent if true, send a client update
     * @return this pointer
     */
    public <T extends AddBuddy> T fireClientEvent(boolean fireClientEvent);
    
    /**
     * if true, fire a server event (BUDDY_ADDED)
     * 
     * @param fireServerEvent if true, fire a server event (BUDDY_ADDED)
     * @return this pointer
     */
    public <T extends AddBuddy> T fireServerEvent(boolean fireServerEvent);
    
}
