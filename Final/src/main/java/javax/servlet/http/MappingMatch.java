package javax.servlet.http;


public enum MappingMatch {
    CONTENT_ROOT,
    DEFAULT,
    EXACT,
    EXTENSION,
    PATH,
    NO_MATCH;


    public MappingMatch ValueOf(String name) {

        if (name.equals(MappingMatch.CONTENT_ROOT)) {
            return MappingMatch.CONTENT_ROOT;
        }
        if (name.equals(MappingMatch.DEFAULT)) {
            return MappingMatch.CONTENT_ROOT;
        }
        if (name.equals(MappingMatch.EXACT)) {
            return MappingMatch.EXACT;
        }
        if (name.equals(MappingMatch.EXTENSION)) {
            return MappingMatch.EXTENSION;
        }
        if (name.equals(MappingMatch.PATH)){
            return MappingMatch.PATH;
    }
        else return MappingMatch.NO_MATCH;

    }

    public static MappingMatch[] Values() {
        int i = 0;
        MappingMatch[] m;
        m = new MappingMatch[6];
        {
            for (MappingMatch c : MappingMatch.values())
                m[i] = c;
            i++;
        }
        return m;
    }
}
