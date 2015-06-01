/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.upc.fib.prop.usParlament.presentation;

import es.upc.fib.prop.usParlament.domain.DomainController;
import es.upc.fib.prop.usParlament.domain.DomainControllerImpl;
import es.upc.fib.prop.usParlament.misc.*;

import java.util.*;


/**
 * ///IMPORTANT
 *  you can see that for now i don't pass real data, i create some data with the same format
 * as the json it will recieve, to be able to see if it works
 * @author miquel
 */
public class PresentationController {

    private DomainController dc;
    private JSONizer j;

    PresentationController()
    {
        dc = new DomainControllerImpl();
        j = new JSONizer();
    }

    public void setCurrentToPartition1() { dc.setCurrentToPartition1(); }
    public void setCurrentToPartition2() { dc.setCurrentToPartition2(); }


    public JSONObject getShortMPList()
    {
        /*
        //TEST

        JSONObject j = new JSONObject();
        JSONArray jay = new JSONArray();
        for(int i = 0;i<10;i++){
            JSONObject jmp = new JSONObject();
            jmp.addPair(new JSONString("State"),new JSONString("AL"));
            jmp.addPair(new JSONString("District"),new JSONString(Integer.toString(i)));
            jay.addElement(jmp);
        }
        j.addPair(new JSONString("MPList"),jay);
        return j;
        */
        ///END OF TEST
        //GOOD CODE
        return j.StringToJSON(dc.getShortMPList());
        //END OF GOOD CODE
    }
    
    public void addMP(JSONObject mp,JSONArray attr)
    {
        dc.addMP(mp);
        Map<String,String> dmp = mp.basicJSONObjectGetInfo();
        String estat = dmp.get("State");
        String distr = dmp.get("District");
        //System.out.println(estat+distr);
        dc.addOrModifyAttribute(mp, attr);

    }

    public void deleteAttribute(JSONObject jo,JSONObject ja)
    {
        dc.deleteAttribute(jo, ja);
    }

    public void addAttributes(JSONObject mp,JSONArray attr)
    {
        dc.addOrModifyAttribute(mp, attr);
    }

    public void deleteMP(State state,int district)
    {
        dc.deleteMP(state, district);
    }

    public JSONObject getMPList()
    {
        return j.StringToJSON(dc.getMPList());
    }
    
    public JSONObject getMPInfo(State state, int district)
    {
         return j.StringToJSON(dc.getMPInfo(state, district));
    }

    public void newCongress()
    {
        dc.newCongress();
    }
    
    public JSONObject getMainPartitionSize()
    {
        JSONString j = new JSONString(dc.getMainPartitionSize());
        JSONString key = new JSONString("Number");
        JSONObject jRet = new JSONObject();
        jRet.addPair(key, j);
        return jRet;
    }

    public JSONObject getMainPartitionCommunities() {
        return null;
    }
    
    public JSONObject getSecCommunityNumber()
    {
        //return domainController.getSecCommuntiyNumber();
        return null;
    }

    public void addMPToCommunity(Integer cNumb, State st, Integer dt) {
        dc.addMPToCommunity(cNumb, st, dt);
    }

    public void deleteMPFromCommunity (Integer cNumb, State st, Integer dt) {
        dc.deleteMPFromCommunity(cNumb, st, dt);
    }

    public boolean existsAttrDef(String name)
    {
        return dc.existsAttrDef(name);
    }

    public void addOrModifyAttrDef(JSONObject obj)
    {
        dc.addOrModifyAttrDef(obj);
    }

    public JSONObject getAttrDefs()
    {
        return j.StringToJSON(dc.getAttrDefs());
    }


    public String saveCurrentCongress(String name) {
        return dc.saveCurrentCongress(name);
    }

    public List<String> loadAllCongressNames() {
        List<String> list = new ArrayList<>();
        JSONizer json = new JSONizer();
        JSONObject jo = json.StringToJSON(dc.loadAllCongressesNames());
        for (JSON j : ((JSONArray)jo.getJSONByKey("congressesNames")).getArray()) {
            list.add(((JSONString) j).getValue());
        }
        return list;
    }

    public String loadCongressAsCurrent(String name) {
        return dc.loadCongressAsCurrent(name);
    }

    public String saveCurrentPartition(String pName) throws InternalException {
        if (pName.trim().length() < 3) {
            throw new InternalException("Partition name has to have at least 2 characters.");
        }
        return dc.saveCurrentPartition(pName.trim());
    }
    
    public void loadPartitionAs(String pName, String as) {
        dc.loadPartitionAs(pName, as);
    }

    public void cleanCommunityManager() {
        dc.cleanCommunityManager();
    }
    public void cleanCompareManager() {
        dc.cleanCompareManager();
    }
    public void computeCommunities(String algorithm, String argument) {
        dc.computeCommunities(algorithm, argument);
    }

    public List<Integer> getCommunityIDs(String partition) {
        JSONizer json = new JSONizer();
        JSONArray jsonIds = (JSONArray)json.StringToJSON(dc.getCommunityIDs(partition)).getJSONByKey("ids");
        List<Integer> ids = new ArrayList<>();
        for (JSON jo : jsonIds.getArray()) {
            ids.add(Integer.valueOf(((JSONString)jo).getValue()));
        }
        return ids;
    }

    public Set<JSONObject> getMPsCurrentPartition(int selectedCommunity) {
        JSONizer json = new JSONizer();
        JSONArray jsonMPs = (JSONArray)json.StringToJSON(
                dc.getMPsMainPartition(String.valueOf(selectedCommunity)))
                .getJSONByKey("Current partition Community numer " + selectedCommunity);
        Set<JSONObject> mps = new HashSet<>();
        for (JSON jo : jsonMPs.getArray()) {
            mps.add((JSONObject)jo);
        }
        return mps;
    }

    public Set<JSONObject> getMPsPartition1(int selectedCommunity) {
        JSONizer json = new JSONizer();
        JSONArray jsonMPs = (JSONArray)json.StringToJSON(
                dc.getMPsPartition1(String.valueOf(selectedCommunity)))
                .getJSONByKey("Partition1 Community number " + selectedCommunity);
        Set<JSONObject> mps = new HashSet<>();
        for (JSON jo : jsonMPs.getArray()) {
            mps.add((JSONObject)jo);
        }
        return mps;
    }

    public Set<JSONObject> getMPsPartition2(int selectedCommunity) {
        JSONizer json = new JSONizer();
        JSONArray jsonMPs = (JSONArray)json.StringToJSON(
                dc.getMPsPartition2(String.valueOf(selectedCommunity)))
                .getJSONByKey("Partition2 Community number " + selectedCommunity);
        Set<JSONObject> mps = new HashSet<>();
        for (JSON jo : jsonMPs.getArray()) {
            mps.add((JSONObject)jo);
        }
        return mps;
    }



    public void addNewCommunity() { dc.addNewCommunity(); }

    public void deleteSelectedCommunity(Integer cNumb) { dc.deleteSelectedCommunity(cNumb); }

    public JSONObject compareFunction() {
        JSONizer json = new JSONizer();
        JSONObject jInfo = (JSONObject)json.StringToJSON(dc.compare2partitions());
        return jInfo;
    }

    public List<String> loadAllPartitionNamesInCurrentCongress() throws InternalException {
        JSONObject allNames = (new JSONizer()).StringToJSON(dc.loadAllPartitionNamesInCurrentCongress());
        if (allNames.getJSONByKey("Exception") != null) {
            throw new InternalException(((JSONString)((JSONObject)allNames.getJSONByKey("Exception"))
                    .getJSONByKey("Message")).getValue());
        }
        List<String> names = new ArrayList<>();
        for (JSON jo : ((JSONArray)allNames.getJSONByKey("partitionNames")).getArray()) {
            names.add(((JSONString)jo).getValue());
        }
        return names;
    }

    public String getCurrentCongressName() {
        return dc.getCurrentCongressName();
    }

    public void computeRelationships() { dc.computeRelationships(); }

    class InternalException extends Exception {
        public InternalException(String message) {
            super(message);
        }
    }


}
















