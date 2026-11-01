    public static List<Integer> reverse(List<Integer> a){

        if(a.size() <= 1) {
            return a;
        }

        int first = a.get(0);

        List<Integer> list = new ArrayList<>(a.subList(1, a.size()));

        list = reverse(list);

        list.add(first);

        return list;
    }
