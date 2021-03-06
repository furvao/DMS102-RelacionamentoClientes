PGDMP     
    #                u            DM102    9.6.2    9.6.2 &    u           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            v           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            w           1262    24576    DM102    DATABASE     �   CREATE DATABASE "DM102" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE "DM102";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            x           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12387    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            y           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    24611    atendimento    TABLE     q   CREATE TABLE atendimento (
    descricao text,
    data date,
    id bigint NOT NULL,
    idcliente_fk bigint
);
    DROP TABLE public.atendimento;
       public         postgres    false    3            �            1259    24676    atendimento_id_seq    SEQUENCE     t   CREATE SEQUENCE atendimento_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.atendimento_id_seq;
       public       postgres    false    3    188            z           0    0    atendimento_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE atendimento_id_seq OWNED BY atendimento.id;
            public       postgres    false    192            �            1259    24577    cliente    TABLE     f   CREATE TABLE cliente (
    nome text,
    telefone text,
    endereco text,
    id bigint NOT NULL
);
    DROP TABLE public.cliente;
       public         postgres    false    3            �            1259    24640    cliente_id_seq    SEQUENCE     p   CREATE SEQUENCE cliente_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.cliente_id_seq;
       public       postgres    false    3    185            {           0    0    cliente_id_seq    SEQUENCE OWNED BY     3   ALTER SEQUENCE cliente_id_seq OWNED BY cliente.id;
            public       postgres    false    189            �            1259    24585    pessoafisica    TABLE     �   CREATE TABLE pessoafisica (
    cpf text,
    identidade text,
    "tipoIdentidade" text,
    id bigint NOT NULL,
    idcliente_fk bigint
);
     DROP TABLE public.pessoafisica;
       public         postgres    false    3            �            1259    24652    pessoafisica_id_seq    SEQUENCE     u   CREATE SEQUENCE pessoafisica_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.pessoafisica_id_seq;
       public       postgres    false    3    186            |           0    0    pessoafisica_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE pessoafisica_id_seq OWNED BY pessoafisica.id;
            public       postgres    false    190            �            1259    24598    pessoajuridica    TABLE     �   CREATE TABLE pessoajuridica (
    cnpj text,
    "razaoSocial" text,
    "inscricaoEstadual" text,
    id bigint NOT NULL,
    idcliente_fk bigint
);
 "   DROP TABLE public.pessoajuridica;
       public         postgres    false    3            �            1259    24664    pessoajuridica_id_seq    SEQUENCE     w   CREATE SEQUENCE pessoajuridica_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.pessoajuridica_id_seq;
       public       postgres    false    187    3            }           0    0    pessoajuridica_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE pessoajuridica_id_seq OWNED BY pessoajuridica.id;
            public       postgres    false    191            �           2604    24678    atendimento id    DEFAULT     b   ALTER TABLE ONLY atendimento ALTER COLUMN id SET DEFAULT nextval('atendimento_id_seq'::regclass);
 =   ALTER TABLE public.atendimento ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    192    188            �           2604    24642 
   cliente id    DEFAULT     Z   ALTER TABLE ONLY cliente ALTER COLUMN id SET DEFAULT nextval('cliente_id_seq'::regclass);
 9   ALTER TABLE public.cliente ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    189    185            �           2604    24654    pessoafisica id    DEFAULT     d   ALTER TABLE ONLY pessoafisica ALTER COLUMN id SET DEFAULT nextval('pessoafisica_id_seq'::regclass);
 >   ALTER TABLE public.pessoafisica ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    190    186            �           2604    24666    pessoajuridica id    DEFAULT     h   ALTER TABLE ONLY pessoajuridica ALTER COLUMN id SET DEFAULT nextval('pessoajuridica_id_seq'::regclass);
 @   ALTER TABLE public.pessoajuridica ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    191    187            n          0    24611    atendimento 
   TABLE DATA               A   COPY atendimento (descricao, data, id, idcliente_fk) FROM stdin;
    public       postgres    false    188   r&       ~           0    0    atendimento_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('atendimento_id_seq', 33, true);
            public       postgres    false    192            k          0    24577    cliente 
   TABLE DATA               8   COPY cliente (nome, telefone, endereco, id) FROM stdin;
    public       postgres    false    185   6'                  0    0    cliente_id_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('cliente_id_seq', 39, true);
            public       postgres    false    189            l          0    24585    pessoafisica 
   TABLE DATA               T   COPY pessoafisica (cpf, identidade, "tipoIdentidade", id, idcliente_fk) FROM stdin;
    public       postgres    false    186   �'       �           0    0    pessoafisica_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('pessoafisica_id_seq', 30, true);
            public       postgres    false    190            m          0    24598    pessoajuridica 
   TABLE DATA               ]   COPY pessoajuridica (cnpj, "razaoSocial", "inscricaoEstadual", id, idcliente_fk) FROM stdin;
    public       postgres    false    187   �(       �           0    0    pessoajuridica_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('pessoajuridica_id_seq', 4, true);
            public       postgres    false    191            �           2606    24680    atendimento atendimento_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY atendimento
    ADD CONSTRAINT atendimento_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.atendimento DROP CONSTRAINT atendimento_pkey;
       public         postgres    false    188    188            �           2606    24644    cliente cliente_pkey 
   CONSTRAINT     K   ALTER TABLE ONLY cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public         postgres    false    185    185            �           2606    24656    pessoafisica pessoafisica_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY pessoafisica
    ADD CONSTRAINT pessoafisica_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.pessoafisica DROP CONSTRAINT pessoafisica_pkey;
       public         postgres    false    186    186            �           2606    24668 "   pessoajuridica pessoajuridica_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY pessoajuridica
    ADD CONSTRAINT pessoajuridica_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.pessoajuridica DROP CONSTRAINT pessoajuridica_pkey;
       public         postgres    false    187    187            �           2606    24693    atendimento idcliente_fk    FK CONSTRAINT     p   ALTER TABLE ONLY atendimento
    ADD CONSTRAINT idcliente_fk FOREIGN KEY (idcliente_fk) REFERENCES cliente(id);
 B   ALTER TABLE ONLY public.atendimento DROP CONSTRAINT idcliente_fk;
       public       postgres    false    2028    185    188            �           2606    24698    pessoafisica idcliente_fk    FK CONSTRAINT     q   ALTER TABLE ONLY pessoafisica
    ADD CONSTRAINT idcliente_fk FOREIGN KEY (idcliente_fk) REFERENCES cliente(id);
 C   ALTER TABLE ONLY public.pessoafisica DROP CONSTRAINT idcliente_fk;
       public       postgres    false    185    186    2028            �           2606    24703    pessoajuridica idcliente_fk    FK CONSTRAINT     s   ALTER TABLE ONLY pessoajuridica
    ADD CONSTRAINT idcliente_fk FOREIGN KEY (idcliente_fk) REFERENCES cliente(id);
 E   ALTER TABLE ONLY public.pessoajuridica DROP CONSTRAINT idcliente_fk;
       public       postgres    false    2028    187    185            n   �   x�]�1n1��+�ڥt��K��n���(Hs\u��`���s�?^�q�Z�� 1�W �$�
:�* ���]��vN0+��^ɒ�"���6���wA͝	�,��ʾmp�L�2w��s%h�j��kU���1{%d٫#-|��kC��&��#��o���ߐf�D�}
�w��#�>#��sj      k   �   x�5�1
�@�z��@2��d�L����& � ,(�Bŋ����]���c¢f�y��n�2S�.��F��:y��/o��T��.�</6�І*��a-1h2��Z"i��j-�V�m������N�NɔLɔ�^E2%S2�����ة0�      l   �   x�=�K
1C��aJ$�{�n
��O�uh\���M$%���I����������0b�c�`9�@����o���3��`=�� 8��.�q��vZvaJ+V(�٠g�R���O(�sA�^Z��ԗ�Lvxz���K�^���Ҁ��	O��LO_/�eχ�}�5(      m   ,   x�34�44�42�4��2��ЌHršb&�Ff\1z\\\ ��     