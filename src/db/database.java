package db;
import java.util.ArrayList;

public class database {
    private static ArrayList<Entity> entities;
    private static int y = 0;

    public static void add(Entity e) {
        entities.add(e);
        y = y + 1;
        e.id = y;
    }

    public static Entity get(int id){
        for (Entity Search : entities) {
            if (Search.id == id)
                return Search;
        }
        throw new EntityNotFoundException();
    }

    public static void delete(int id){
        for(Entity Search : entities){
            if(Search.id == id)
                entities.remove(Search);
        }
        throw new EntityNotFoundException(id);
    }

    public static void update(Entity e){
        for(Entity find : entities){
            if(find.id == e.id)
                find = e;
        }
        throw new EntityNotFoundException();
    }

    static class EntityNotFoundException extends RuntimeException{
        public EntityNotFoundException() {
            super("Cannot Find Entity");
        }

        public EntityNotFoundException(String message){
            super("Exception :" + message);
        }

        public EntityNotFoundException(int id){
            super("Cannot Find Entity With Id =" + id);
        }
    }




}

